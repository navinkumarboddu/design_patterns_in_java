package structural.designpatternsinjava.compositebefore;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    String name;

    String url;

    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<MenuComponent> getMenuComponents() {
        return menuComponents;
    }

    public abstract String toString();


}
