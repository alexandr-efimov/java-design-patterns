package iterator;

import java.util.List;

public class NameRepository implements Container<String> {

    private List<String> names = List.of("Alex", "Ron", "Harry");

    @Override
    public Iterator<String> getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {

        private int index;

        @Override
        public boolean hasNext() {
            return index < names.size();
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new IllegalStateException("No elements more");
            }

            return names.get(index++);
        }
    }
}
