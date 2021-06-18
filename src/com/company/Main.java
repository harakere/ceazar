package com.company;

public class Main {

    protected static char[] upper = {'А','Б','В','Г','Д','Е','Ё','Ж','З','И','Й',
            'К','Л','М','Н','О','П','Р','С','Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ъ','Ы','Ь','Э','Ю','Я'};

    protected static char[] lower = {'а','б','в','г','д','е','ё','ж','з','и','й',
            'к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я',};

    protected static char[] space = {' '};

    public static final int n = 32;

// Полностью код мне не удалось додумать, из ошибок отмечу лишние буквы перед пробелом и в некоторых местах сдвиги неправильные


    public static void main(String[] args) {
        String text = "Еъёчхф Вхзёюлх, адздёиу ф ждэщхб, црбх еёдюэчъщъгюъв южаижжзчх, ждчъёнъгжзчдв. Ъы зёюивй жёхчгюв бюнс ж ъы вдгивъгзхбсгрв аёхкдв. \n" +
                "Зъеъёс вгъ дмъчющгд, мзд гъюэцъьгджзс тздшд аёхкх фчбфъзжф жбъщжзчюъв гъждчъёнъгжзчх мъбдчъмъжадшд югщючющиивх. \n" +
                "Ф юэимюб чхни южздёюу ю чгыж юэвъгъгюф, здмгъъ дзёхэюч еджздфггиу юэвъгмючджзс мъбдчъмъжаюк едёдадч. \n" +
                "Ю зъв гъ въгъъ, еджбъщдчхбх гъищхмх. Ф еёюнъб а чрчдщи, мзд чюгдя чжъви вдя югзъббъаз, х чдэвдьгд, вды мёъэвъёгдъ жзёъвбъгюъ ад чжъви шхёвдгюмгдви. \n" +
                "Гхязю ёънъгюъ вгъ едвдшбх еёдшёхввх югзиюзючгдшд зюех, жеълюхбсгд ждэщхггхф щбф юэимъгюф деёъщъбъггрк жздёдг мъбдчъмъжадя щиню. \n" +
                "Въгф вдьгд гхэчхзс дзлдв Вхзёюлр, х ъы, цъэ еёъичъбюмъгюф, вхзъёсу.";
        StringBuilder output = new StringBuilder();

        for (int k = 1; k < 32; k++) {

            for (int i = 0; i < text.length(); ++i) {
                char c = text.charAt(i);

                if (findIndLower(c) == -1) {
                    int y = (findIndUpper(c) + k) % n;
                    output.append(upper[y]);
                }
                if (findIndUpper(c) == -1) {
                    int y = (findIndLower(c) + k) % n;
                    output.append(lower[y]);
                }
                if (findIndSpace(c) == 0){
                    int y = (findIndSpace(c));
                    output.append(space[y]);
                }
            }
            System.out.println(output.toString());
            output = new StringBuilder();

        }
    }

    public static int findIndUpper(char c){
        int rez = -1;
        for(int i=0; i<upper.length; ++i){
            if (c == upper[i]) rez = i;
        }
        return rez;
    }

    public static int findIndLower(char c){
        int rez = -1;
        for(int i=0; i<lower.length; ++i){
            if (c == lower[i]) rez = i;
        }
        return rez;
    }

    public static int findIndSpace(char c){
        int rez = -1;
        for(int i=0; i<1; ++i){
            if (c == space[i]) rez = i;
        }
        return  rez;
    }

}