package extra;

public class ChildClass  extends ParentClass{
        static {
            System.out.println("Static block - Child");
        }

        public ChildClass() {
            System.out.println("constructor - Child");
        }

        {
            System.out.println("Block 1 - Child");
        }

        private int childValue = initChildValue();
        private static int staticChildValue = initStaticChildValue();

        {
            System.out.println("Block 2 - Child");
        }



        private int initChildValue() {
            System.out.println("childValue initialization");
            return 1;
        }

        private static int initStaticChildValue() {
            System.out.println("Static childValue initialization");
            return 1;
        }
    }


