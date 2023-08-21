package LmsTaskEnum;

public enum Days {
    MONDAY{
        @Override
        public void method() {
            System.out.println("Дуйшомбу куну теориялык Джава окуйм");
        }
    },
    TUESDAY{
        @Override
        public void method() {
            System.out.println("Шейшемби куну практикалык Джава окуйм");
        }
    },
    WEDNESDAY{
        @Override
        public void method() {
            System.out.println("Шаршемби куну теориялык Джава жана англис тилин окуйм");
        }
    },
    THURSDAY{
        @Override
        public void method() {
            System.out.println("Бейшемби куну практикалык Джава жана софт скилл сабагын окуйм");
        }
    },
    FRIDAY{
        @Override
        public void method() {
            System.out.println("Жума куну теориялык Джава окуйм жана ивент");
        }
    },
    SATURDAY{
        @Override
        public void method() {
            System.out.println("Ишемби куну оз алдынча Джава окуйм жана  тапшырмаларды аткарам");
        }
    },
    SUNDAY{
        @Override
        public void method() {
            System.out.println("Жекшемби куну оз алдынча Джава окуйм жана  тапшырмаларды аткарам");
        }
    };

    public abstract void method();
}
