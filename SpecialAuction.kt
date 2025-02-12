

// 7. Special auction
// Typically in an auction, the highest bidder determines the price of an item. In this special auction, if there's no bidder for an item, the item is automatically sold to the auction house at the minimum price.

// In the initial code provided in the following code snippet, you're given an auctionPrice() function that accepts a nullable Bid? type as an argument:

// Complete the auctionPrice() function so that the program prints these lines:


// Item A is sold at 5000.
// Item B is sold at 3000.

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int) : Int {
    return bid?.amount ?: minimumPrice
} 

fun main() {
    val kotlin = "🙂"
    println(kotlin)
    
	val winningBid = Bid(5000, "Private Collector")
    
    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}