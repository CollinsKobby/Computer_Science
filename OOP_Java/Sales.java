class Sales {
    public static void main(String[] args) {
        int highStreet[][] = {{42000,48000,50000}, {52000,58000,60000}, {46000,49000,58000}, {50000,51000,61000}};
        int mall[][] = {{57000,63000,60000}, {70000,67000,73000}, {67000,65000,62000}, {72000,69000,75000}};
        // i represents the row
        // j represents columns
        int i, j;
        
        // Monthly combined sales
        System.out.println("The monthly combined sales for the two shops from January to December:");
        for(i = 0; i < highStreet.length; i++){
            for(j = 0; j < highStreet[i].length; j++){
                System.out.println(highStreet[i][j] + mall[i][j] );
            }
        }
        
        // Monthly combined quarterly sales
        int quarter1 = 0, quarter2 = 0, quarter3 = 0, quarter4 = 0;
        for(i = 0; i < highStreet.length; i++){
            for (j = 0; j < highStreet[i].length; j++){
                if (i == 0){
                    quarter1 += (highStreet[i][j] + mall[i][j]);
                }else if(i == 1){
                    quarter2 += (highStreet[i][j] + mall[i][j]);
                }else if(i == 2){
                    quarter3 += (highStreet[i][j] + mall[i][j]);
                }else if(i == 3){
                    quarter4 += (highStreet[i][j] + mall[i][j]);
                }
            }
        }
        System.out.println("Monthly combined sales Quarter 1 for both shops: " + quarter1);
        System.out.println("Monthly combined sales Quarter 2 for both shops: " + quarter2);
        System.out.println("Monthly combined sales Quarter 3 for both shops: " + quarter3);
        System.out.println("Monthly combined sales Quarter 4 for both shops: " + quarter4);
        
        // Respective shops annual sales
        int annualHighStreet = 0;
	int annualMall = 0;
        for(i = 0; i < highStreet.length; i++){
            for(j = 0; j < highStreet[i].length; j++){
                annualHighStreet += highStreet[i][j];
		annualMall += mall[i][j];
            }
        }
        System.out.println("High Street Branch annual total: " + annualHighStreet);
        System.out.println("Mall Branch annual total: " + annualMall);
        
        // The grand total annual combined sales for the two shops
        int GrandTotal = annualHighStreet + annualMall;
        System.out.println("The grand total annual combined sales for the two shops: " + GrandTotal);
    }    
}
