package src.BackEnd;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import src.utils.FiniteSet;
import src.utils.TransitionFunction;

import java.util.InputMismatchException;
public class NonDeterministicAutomataTest {
    @Test
    public void testZeroOne1(){
        FiniteSet<Integer> initState = FiniteSet.of(0);
        FiniteSet<Integer> finalState = FiniteSet.of(2);
        FiniteSet<Integer> stateSet = FiniteSet.of(0, 1, 2);
        FiniteSet<Character> symbolSet = FiniteSet.of('0', '1');
        TransitionFunction<Integer, Character> transitionFunction = TransitionFunction.of(
                0, '0', FiniteSet.of(1),
                0, '1', FiniteSet.of(0),
                1, '0', FiniteSet.of(1),
                1, '1', FiniteSet.of(2),
                2, '0', FiniteSet.of(1),
                2, '1', FiniteSet.of(0)
        );
        NonDeterministicAutomata zeroOne = new NonDeterministicAutomata(initState, finalState,
                stateSet, symbolSet, transitionFunction, false);
        zeroOne.accept("1101");
        assertTrue(zeroOne.isAcceptedState(zeroOne.getCurrentState()));
    }

    @Test
    public void testZeroOne2(){
        FiniteSet<Integer> initState = FiniteSet.of(0);
        FiniteSet<Integer> finalState = FiniteSet.of(2);
        FiniteSet<Integer> stateSet = FiniteSet.of(0, 1, 2);
        FiniteSet<Character> symbolSet = FiniteSet.of('0', '1');
        TransitionFunction<Integer, Character> transitionFunction = TransitionFunction.of(
                0, '0', FiniteSet.of(1),
                0, '1', FiniteSet.of(0),
                1, '0', FiniteSet.of(1),
                1, '1', FiniteSet.of(2),
                2, '0', FiniteSet.of(1),
                2, '1', FiniteSet.of(0)
        );
        NonDeterministicAutomata zeroOne = new NonDeterministicAutomata(initState, finalState,
                stateSet, symbolSet, transitionFunction, false);
        zeroOne.accept("01");
        assertTrue(zeroOne.isAcceptedState(zeroOne.getCurrentState()));
    }

    @Test
    public void testZeroOne3(){
        FiniteSet<Integer> initState = FiniteSet.of(0);
        FiniteSet<Integer> finalState = FiniteSet.of(2);
        FiniteSet<Integer> stateSet = FiniteSet.of(0, 1, 2);
        FiniteSet<Character> symbolSet = FiniteSet.of('0', '1');
        TransitionFunction<Integer, Character> transitionFunction = TransitionFunction.of(
                0, '0', FiniteSet.of(1),
                0, '1', FiniteSet.of(0),
                1, '0', FiniteSet.of(1),
                1, '1', FiniteSet.of(2),
                2, '0', FiniteSet.of(1),
                2, '1', FiniteSet.of(0)
        );
        NonDeterministicAutomata zeroOne = new NonDeterministicAutomata(initState, finalState,
                stateSet, symbolSet, transitionFunction, false);
        zeroOne.accept("001101");
        assertTrue(zeroOne.isAcceptedState(zeroOne.getCurrentState()));
    }

    @Test
    public void testZeroOne4(){
        FiniteSet<Integer> initState = FiniteSet.of(0);
        FiniteSet<Integer> finalState = FiniteSet.of(2);
        FiniteSet<Integer> stateSet = FiniteSet.of(0, 1, 2);
        FiniteSet<Character> symbolSet = FiniteSet.of('0', '1');
        TransitionFunction<Integer, Character> transitionFunction = TransitionFunction.of(
                0, '0', FiniteSet.of(1),
                0, '1', FiniteSet.of(0),
                1, '0', FiniteSet.of(1),
                1, '1', FiniteSet.of(2),
                2, '0', FiniteSet.of(1),
                2, '1', FiniteSet.of(0)
        );
        NonDeterministicAutomata zeroOne = new NonDeterministicAutomata(initState, finalState,
                stateSet, symbolSet, transitionFunction, false);
        zeroOne.accept("0011011");
        assertFalse(zeroOne.isAcceptedState(zeroOne.getCurrentState()));
    }

    @Test
    public void testZeroOne5(){
        FiniteSet<Integer> initState = FiniteSet.of(0);
        FiniteSet<Integer> finalState = FiniteSet.of(2);
        FiniteSet<Integer> stateSet = FiniteSet.of(0, 1, 2);
        FiniteSet<Character> symbolSet = FiniteSet.of('0', '1');
        TransitionFunction<Integer, Character> transitionFunction = TransitionFunction.of(
                0, '0', FiniteSet.of(1),
                0, '1', FiniteSet.of(0),
                1, '0', FiniteSet.of(1),
                1, '1', FiniteSet.of(2),
                2, '0', FiniteSet.of(1),
                2, '1', FiniteSet.of(0)
        );
        NonDeterministicAutomata zeroOne = new NonDeterministicAutomata(initState, finalState,
                stateSet, symbolSet, transitionFunction, false);
        zeroOne.accept("010");
        assertFalse(zeroOne.isAcceptedState(zeroOne.getCurrentState()));
    }

    @Test(expected = RuntimeException.class)
    public void testZeroOne6(){
        FiniteSet<Integer> initState = FiniteSet.of(0);
        FiniteSet<Integer> finalState = FiniteSet.of(2);
        FiniteSet<Integer> stateSet = FiniteSet.of(0, 1, 2);
        FiniteSet<Character> symbolSet = FiniteSet.of('0', '1');
        TransitionFunction<Integer, Character> transitionFunction = TransitionFunction.of(
                0, '0', FiniteSet.of(1),
                0, '1', FiniteSet.of(0),
                1, '0', FiniteSet.of(1),
                1, '1', FiniteSet.of(2),
                2, '0', FiniteSet.of(1),
                2, '1', FiniteSet.of(0)
        );
        NonDeterministicAutomata zeroOne = new NonDeterministicAutomata(initState, finalState,
                stateSet, symbolSet, transitionFunction, false);
        zeroOne.accept("0a10");
        assertFalse(zeroOne.isAcceptedState(zeroOne.getCurrentState()));
    }

    @Test(expected = RuntimeException.class)
    public void testZeroOne7(){
        FiniteSet<Integer> initState = FiniteSet.of(0);
        FiniteSet<Integer> finalState = FiniteSet.of(2);
        FiniteSet<Integer> stateSet = FiniteSet.of(0, 1, 2);
        FiniteSet<Character> symbolSet = FiniteSet.of('0', '1');
        TransitionFunction<Integer, Character> transitionFunction = TransitionFunction.of(
                0, '0', FiniteSet.of(1),
                0, '1', FiniteSet.of(0),
                1, '0', FiniteSet.of(1),
                1, '1', FiniteSet.of(2),
                2, '0', FiniteSet.of(1),
                2, '1', FiniteSet.of(0)
        );
        NonDeterministicAutomata zeroOne = new NonDeterministicAutomata(initState, finalState,
                stateSet, symbolSet, transitionFunction, false);
        zeroOne.accept("010 10");
        assertFalse(zeroOne.isAcceptedState(zeroOne.getCurrentState()));
    }

    @Test(expected = RuntimeException.class)
    public void testZeroOne8(){
        FiniteSet<Integer> initState = FiniteSet.of(0);
        FiniteSet<Integer> finalState = FiniteSet.of(2);
        FiniteSet<Integer> stateSet = FiniteSet.of(0, 1, 2);
        FiniteSet<Character> symbolSet = FiniteSet.of('0', '1');
        TransitionFunction<Integer, Character> transitionFunction = TransitionFunction.of(
                0, '0', FiniteSet.of(1),
                0, '1', FiniteSet.of(0),
                1, '0', FiniteSet.of(1),
                1, '1', FiniteSet.of(2),
                2, '0', FiniteSet.of(1),
                2, '1', FiniteSet.of(0)
        );
        NonDeterministicAutomata zeroOne = new NonDeterministicAutomata(initState, finalState,
                stateSet, symbolSet, transitionFunction, false);
        zeroOne.accept("+01010");
        assertFalse(zeroOne.isAcceptedState(zeroOne.getCurrentState()));
    }

    @Test(expected = RuntimeException.class)
    public void testZeroOne9(){
        FiniteSet<Integer> initState = FiniteSet.of(0);
        FiniteSet<Integer> finalState = FiniteSet.of(2);
        FiniteSet<Integer> stateSet = FiniteSet.of(0, 1, 2);
        FiniteSet<Character> symbolSet = FiniteSet.of('0', '1');
        TransitionFunction<Integer, Character> transitionFunction = TransitionFunction.of(
                0, '0', FiniteSet.of(1),
                0, '1', FiniteSet.of(0),
                1, '0', FiniteSet.of(1),
                1, '1', FiniteSet.of(2),
                2, '0', FiniteSet.of(1),
                2, '1', FiniteSet.of(0)
        );
        NonDeterministicAutomata zeroOne = new NonDeterministicAutomata(initState, finalState,
                stateSet, symbolSet, transitionFunction, false);
        zeroOne.accept(" 01010");
        assertFalse(zeroOne.isAcceptedState(zeroOne.getCurrentState()));
    }

    @Test(expected = RuntimeException.class)
    public void testZeroOne10(){
        FiniteSet<Integer> initState = FiniteSet.of(0);
        FiniteSet<Integer> finalState = FiniteSet.of(2);
        FiniteSet<Integer> stateSet = FiniteSet.of(0, 1, 2);
        FiniteSet<Character> symbolSet = FiniteSet.of('0', '1');
        TransitionFunction<Integer, Character> transitionFunction = TransitionFunction.of(
                0, '0', FiniteSet.of(1),
                0, '1', FiniteSet.of(0),
                1, '0', FiniteSet.of(1),
                1, '1', FiniteSet.of(2),
                2, '0', FiniteSet.of(1),
                2, '1', FiniteSet.of(0)
        );
        NonDeterministicAutomata zeroOne = new NonDeterministicAutomata(initState, finalState,
                stateSet, symbolSet, transitionFunction, false);
        zeroOne.accept("0101+0");
        assertFalse(zeroOne.isAcceptedState(zeroOne.getCurrentState()));
    }
}