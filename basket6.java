//If basket has null item, output of count should be 0 --> unique to 2,4,9 correct
	@Test
	public void nullItem() {
		Basket basketToTest = makeBasket();
		Item a = null;
		basketToTest.addToBasket(a);
		assertEquals(0, basketToTest.count());
		
	}
//If basket has some null and some actual item --> unique to 2,4,9 correct
	@Test
	public void totalCount2() {
		Basket basketToTest = makeBasket();
		Item a = new Item("Shampoo",5);
		basketToTest.addToBasket(null);
		basketToTest.addToBasket(a);
		basketToTest.addToBasket(null);
		basketToTest.addToBasket(a);
		assertEquals(2, basketToTest.count());
	}

	@Test
	public void threeItems() {
		Basket basketToTest = makeBasket();
		
		Item a = new Item("Book",2);
		Item c = new Item("Conditioner",1);
		
		basketToTest.addToBasket(a);
		basketToTest.addToBasket(c);
		basketToTest.addToBasket(null);
		basketToTest.addToBasket(a);
		basketToTest.addToBasket(c);
		basketToTest.removeFromBasket(a);
		
		assertEquals(2, basketToTest.countItem(a));
	}
  
  @Test
	public void twoNull() {
		Basket basketToTest = makeBasket();
		Item a = new Item("Book",2);
		basketToTest.addToBasket(null);
		basketToTest.addToBasket(null);
		basketToTest.addToBasket(a);
		assertEquals(2,basketToTest.totalCost());
	}
  
  @Test
	public void count10000Null() {
		Basket basketToTest = makeBasket();
		Item a = null;
		Item c = new Item("Conditioner",15);
		for(int i=0; i< 10000;i++) {
			basketToTest.addToBasket(a);
		}
		assertEquals(0, basketToTest.countItem(a));
	}
  
  @Test
	public void twoItemsL() {
		Basket basketToTest = makeBasket();
		
		Item a = new Item("Book",2);
		Item b = new Item("Conditioner",1);
		
		basketToTest.addToBasket(a);
		basketToTest.removeFromBasket(a);
		basketToTest.addToBasket(null);
		basketToTest.removeFromBasket(null);
		basketToTest.addToBasket(b);
		basketToTest.removeFromBasket(b);
		
		assertEquals(0,basketToTest.totalCost());
	}
