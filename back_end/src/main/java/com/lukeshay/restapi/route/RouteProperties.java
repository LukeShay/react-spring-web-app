package com.lukeshay.restapi.route;

public class RouteProperties {
  public enum Grades {}

  public enum RouteTypes {
    BOULDER,
    TOP_ROPE,
    LEAD,
    AUTO_BELAY;

    public String toString() {
      if (this.equals(BOULDER)) {
        return "Boulder";
      } else if (this.equals(TOP_ROPE)) {
        return "Top rope";
      } else if (this.equals(LEAD)) {
        return "Lead";
      } else if (this.equals(AUTO_BELAY)) {
        return "Auto belay";
      } else {
        return null;
      }
    }
  }

}