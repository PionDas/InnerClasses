public class TestClass {
    private int age;
    private int color;

    private class TestInnerClass{
        private String name;

        public TestInnerClass(String name) {
            this.name = name;
        }

        public void printAge(){
            System.out.println("Age: " + age);
        }

    }
}
