<%--
  Created by IntelliJ IDEA.
  User: Brenda
  Date: 10/8/2015
  Time: 12:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  class Point {
  public double x, y;
  public static Point origin = new Point(0,0);
  // This always refers to an object at (0,0)
  Point(double x_value, double y_value) {
  x = x_value;
  y = y_value;
  }
  public void clear() {
  this.x = 0;
  this.y = 0;
  }
  public double distance(Point that) {
  double xDiff = x - that.x;
  double yDiff = y - that.y;
  return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }


  </body>
</html>
