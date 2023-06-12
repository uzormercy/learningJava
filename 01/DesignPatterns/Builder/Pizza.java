package DesignPatterns.Builder;

class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    private Pizza(Builder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }

    public String getDough() 
    {
        return  this.dough;
    }

    public String getSauce() 
    {
        return this.sauce;
    }
    public String getTopping()
    {
        return this.topping;
    }

    public static class Builder {
        
        private String dough = "Regular";
        private String sauce = "Tomato";
        private String topping = "Cheese";

        public Builder setDough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder setTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
