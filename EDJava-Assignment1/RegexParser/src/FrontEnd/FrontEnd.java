package src.FrontEnd;


import java.util.Queue;
import java.util.Stack;

public class FrontEnd {
    private static RParser stringParser;
    private Queue<Character> outputQueue;
    private StateContainer modelContainer;

    FrontEnd(){
        stringParser=new RParser();
    }

    FrontEnd(String string, boolean debug){
        this.stringParser = new RParser();
        this.outputQueue = stringParser.parse(string, false);
        this.modelContainer = buildContainer();
        if (debug){
            System.out.println(modelContainer);
        }
        System.out.println("ready");
    }

    private StateContainer buildContainer(){
        Stack<StateContainer> container = new Stack<>();
        while(!outputQueue.isEmpty()){
            char c = outputQueue.remove();
            if (stringParser.isAlphanumeric(c)){ //Create new container and push to stack
                container.push(StateContainer.fromSymbol(c));
            }
            if (stringParser.isOperator(c)){
                if (c == '.'){
                    StateContainer secondOp = container.pop();
                    StateContainer firstOp = container.pop();
                    container.push(StateContainer.fromSequence(firstOp, secondOp));
                }
                if (c == '|'){
                    StateContainer secondOp = container.pop();
                    StateContainer firstOp = container.pop();
                    container.push(StateContainer.fromAlternation(firstOp, secondOp));
                }
                if (c == '*'){
                    StateContainer firstOp = container.pop();
                    container.push(StateContainer.fromRepetitionZero(firstOp));
                }
                if (c == '+'){
                    StateContainer firstOp = container.pop();
                    container.push(StateContainer.fromRepetitionOne(firstOp));
                }
            }
        }
        StateContainer result = container.pop();
        result.compile();

        return result;
    }

    public static void main(String[] args) {
        FrontEnd parserFrontEnd = new FrontEnd("abc",false);
    }
}