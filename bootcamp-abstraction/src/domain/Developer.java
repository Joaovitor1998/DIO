package domain;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Developer {
    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> finishedContent = new LinkedHashSet<>();

    public void subscribeToBootcamp(Bootcamp bootcamp) {
        this.subscribedContent.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevelopers().add(this);
    }

    public void progress() {
        Optional<Content> content = this.subscribedContent.stream().findFirst();
        if (content.isPresent()) {
            this.finishedContent.add(content.get());
            this.subscribedContent.remove(content.get());
        } else {
            System.err.println("You are not subscribed to this Bootcamp.");
        }
    }

    public double calculateTotalXP() {
        return this.finishedContent.stream()
                .mapToDouble(content -> content.calculateXP())
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Content> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Content> getFinishedContent() {
        return finishedContent;
    }

    public void setFinishedContent(Set<Content> finishedContent) {
        this.finishedContent = finishedContent;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((finishedContent == null) ? 0 : finishedContent.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((subscribedContent == null) ? 0 : subscribedContent.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Developer other = (Developer) obj;
        if (finishedContent == null) {
            if (other.finishedContent != null)
                return false;
        } else if (!finishedContent.equals(other.finishedContent))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (subscribedContent == null) {
            if (other.subscribedContent != null)
                return false;
        } else if (!subscribedContent.equals(other.subscribedContent))
            return false;
        return true;
    }

}
