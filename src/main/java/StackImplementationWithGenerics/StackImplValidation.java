package StackImplementationWithGenerics;

public class StackImplValidation {
    public static void main(String[] args) {
        StackImpl<String> stack = new StackImpl<>(String.class, 10);


        System.out.println(stack.pop());

        for(int size = 0; size < 20; size++) {
            stack.push(Integer.valueOf(size).toString());
        }

        System.out.println(stack);
        stack.push(null);
    }
}
