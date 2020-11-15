package com.aceinthedeck;


/*

Given two rectangles find if they are overlapping. If they are overlapping return the rectangle.

The given rectangles are always parallel to x and y axis, that is, they are never diagonal


 */


public class RectangleOverlap {

    int startPoint = 0;
    int overlapLength = 0;

    public RectangleOverlap(int startPoint, int overlapLength){
        this.startPoint = startPoint;
        this.overlapLength = overlapLength;
    }

    public static RectangleOverlap overlap(int p1, int length1, int p2, int length2){

        int highestStartPoint = Math.max(p1, p2);
        int lowestEndPoint = Math.min(p1+length1, p2+length2);


        if(highestStartPoint>=lowestEndPoint){
            return new RectangleOverlap(0, 0);
        }

        int overlapLength = lowestEndPoint - highestStartPoint;
        return new RectangleOverlap(lowestEndPoint, overlapLength);
    }

}

class Rectangle{

    int leftX;
    int bottomY;
    int width;
    int height;

    public Rectangle(int leftX, int bottomY, int width, int height){
        this.leftX = leftX;
        this.bottomY = bottomY;
        this.width = width;
        this.height = height;
    }


   public Rectangle findOverlap(Rectangle rectangle2){

       RectangleOverlap xOverlap = RectangleOverlap.overlap(this.leftX, width, rectangle2.leftX, rectangle2.width);
       RectangleOverlap yOverlap = RectangleOverlap.overlap(this.bottomY, height, rectangle2.bottomY, rectangle2.height);

       if(xOverlap.overlapLength == 0 || yOverlap.overlapLength==0){
           return new Rectangle(0,0,0,0);
       }

       return new Rectangle(xOverlap.startPoint, yOverlap.startPoint, xOverlap.overlapLength, yOverlap.overlapLength);

   }
}

