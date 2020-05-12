# Bitpanda

1. Show a list of Asset Wallets (Icon, Symbol, balance). 
   As you can see there is a lot of code reuse, try to improve it 
   Cryptocoin and Metal are considered as Asset, Fiat and Asset are considered as Currency. 
   Each Currency has a Wallet, and you can have multiple Wallets per Currency.

  a. for Metals show the name in the list eg.: "Gold" 
  b. do not show deleted wallets
  c. Data should only be retrieved from the Repository

2. Sort the list by type : fiat, cryptocoins, metals and the balance of the wallet
3. Add a functionality to filter Currencies by type (a simple button which rotates the type is enough)
4. If you click on an entry open a simple DetailView where you show the price of the coin
   a. use precision to format the price with correct amount of decimal places
   b. Prices are euro prices

5. Test your implementation with Unit Tests


GENERAL

* You are free to refactor and improve the given structure. let us know what and why
* Use an architecture pattern of your choice

NICE TO HAVE 
* You are free to implement also a nice UI 

![Screenshot](https://raw.githubusercontent.com/Drjacky/Bitpanda/master/list.png)