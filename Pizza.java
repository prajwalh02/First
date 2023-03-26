public class Pizza {
    
/*****************************************/
//main attributes
    private int price;
    private boolean isVeg;
    private String bill;

/*****************************************/

//----------------------------------------//
    private int basePrice;
    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int paperBagPrice;

//----------------------------------------// 

//making an flag
//*****************************************/
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isTakeAwayAdded;
    private boolean isBillGenerated;

//*****************************************/




    public Pizza(Boolean isVeg)
    {
        this.isVeg = isVeg;
        if(this.isVeg == true)                //veg pizza
        {
            this.basePrice = 300;
            this.extraToppingsPrice = 70;
        }
        else {                               //non-veg pizza
            this.basePrice = 400;
            this.extraToppingsPrice = 120;
        }
        this.extraCheesePrice = 80;
        this.paperBagPrice = 20;
        this.price = this.basePrice;
    }

    public int getPrice()
    {
        return this.price;
    }

    public void addExtraCheese()
    {
        //check whether user press this button already or not ,
        //if it is press for the  1st time then price is added
        if(this.isExtraCheeseAdded == false)
        {
            this.price += this.extraCheesePrice;
            this.isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings()
    {
        //check whether user press this button already or not ,
        //if it is press for the  1st time then price is added
        if(this.isExtraToppingsAdded == false) 
        {
            this.price += this.extraToppingsPrice;
            this.isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway()
    {
        if(this.isTakeAwayAdded == false)
        {
            this.price += this.paperBagPrice;
            this.isTakeAwayAdded = true;
        }
    }

    public String getBill()
    {
        if(this.isBillGenerated == false)
        {
            this.bill = "Base Price of the Pizza : " + this.basePrice + "\n";

            if(this.isExtraCheeseAdded == true)
            {
                this.bill += "Extra Cheese Added : " + this.extraCheesePrice + "\n";
            }

            if(this.isExtraToppingsAdded == true)
            {
                this.bill += "Extra Toppings Added : " + this.extraToppingsPrice + "\n";
            }
            
            if(this.isTakeAwayAdded == true)
            {
                this.bill += "Paperbag Added : " + this.paperBagPrice + "\n";
            }

            this.bill += "Total Price :" + this.price;
            this.isBillGenerated = true;
        }
        
        return this.bill;
    }




}
