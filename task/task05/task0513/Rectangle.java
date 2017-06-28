package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов initialize(…)

Примеры:
— заданы 4 параметра: left, top, width, height
— ширина/высота не задана (оба равны 0)
— высота не задана (равно ширине) создаём квадрат
— создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle {
    //напишите тут ваш код
    //красивое решение
    private int top, left, width, height;

    public void initialize(int top, int left, int width, int height){
        this.initialize(top, left, width, height);
    }
    public void initialize(int top, int left){
        this.initialize(top, left, 0, 0);
    }
    public void initialize(int top, int left, int width){
        this.initialize(top, left, width, width);
    }
    public void initialize(Rectangle anotherRectangle){
        this.initialize(anotherRectangle.top, anotherRectangle.left, anotherRectangle.width, anotherRectangle.height);
    }


/* // Обычное решение
    int left, top, width, height;

    //1
    public void initialize(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    //2
    public void initialize(int left, int top) {
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }

    //3
    public void initialize(int left, int top, int height) {
        this.left = left;
        this.top = top;
        this.height = this.width;
    }

    //4
    public void initialize(Rectangle newparam) {
        this.left = newparam.left;
        this.top = newparam.top;
        this.width = newparam.width;
        this.height = newparam.height;
    }*/



    public static void main(String[] args) {

    }
}
