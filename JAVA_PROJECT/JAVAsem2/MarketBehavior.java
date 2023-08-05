package JAVA_PROJECT.JAVAsem2;

    public interface MarketBehavior {
        void acceptToMarket(Buyer actor);
        void releaseFromMarket(Buyer actor);
        void update();
    }
