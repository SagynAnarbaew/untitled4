public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(
                EnumColor.BLACK,
                new Shelter("Маяковский", "Маяковского 128"),
                "Шарик",
                "Овчарка"
        );
        System.out.println(dog.getInfo());

        dog.makeVoice();
        dog.makeVoice("Гав");
        dog.makeVoice("Ауууууу", 5);

        Dog dog1 = new Dog(
                EnumColor.BLACK,
                new Shelter(" Ак орго", "Ак-орго 261Б"),
                "Барон",
                "Пид");
        System.out.println(dog1.getInfo());


        dog1.makeVoice();
        dog1.makeVoice("PPPPP");
        dog1.makeVoice("ВАВ ВАВ ВАВ ВАВ", 1);



        Dog dog2 = new Dog(
                EnumColor.BROWN,
                new Shelter("Токтогул", "Токтогула 56"),
                "Гера",
                "Став"
        );
        System.out.println(dog2.getInfo());

        dog2.makeVoice();
        dog2.makeVoice("АААРРРРРРР");
        dog2.makeVoice("АУУУУУУУ", 3);


        Dog dog3 = new Dog(
                EnumColor.GRAY,
                new Shelter("Матросов", "Матросова 6а"),
                "Хатико",
                "Хаски"
        );
        System.out.println(dog3.getInfo());



        dog3.makeVoice();
        dog3.makeVoice("ГАВ ГАВ");
        dog3.makeVoice("РРРРР", 6);
    }}