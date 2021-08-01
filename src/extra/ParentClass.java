package extra;

public class ParentClass {

        static {
            System.out.println("Static block - Parent");
        }

        {
            System.out.println("Block 1 - Parent");
        }


        public ParentClass() {
            System.out.println("constructor - Parent");
        }

        private int parentValue = initParentValue();
        private static int staticParentValue = initStaticParentValue();





        {
            System.out.println("Block 2 - Parent");
        }



        private int initParentValue() {
            System.out.println("parentValue initialization");
            return 1;
        }

        private static int initStaticParentValue() {
            System.out.println("Static parentValue initialization");
            return 1;
        }
}


