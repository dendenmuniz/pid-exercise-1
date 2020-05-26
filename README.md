# Programming in Depth - Exercise 1 - XML

Imagine that you have a supply of protein bars and you want to present these bars to potential customers to make it easier for them to reach their nutritional goals. Some of them might be interested in eating as much protein as they can (bodybuilders, I guess) and some of them might be interested in eating carbohydrates as well and so on. Your job is to make an application that will assist the customers in choosing the right product. At your disposal you have the information about the protein bars represented in an XML file [`bars.xml`](bars.xml).


### Task
Write Java code with the following functionalities (text interface program as the IP project):<br>
Extract the information from the XML file into a data structure of your choice.<br>
After that give the user the ability to choose from the following options:

<ul>
    <li>Show the name of all bars.</li>
    <li>Sort bars  based on highest protein content.</li>
    <li>Sort bars based on highest fat content.</li>
	<li>Filter bars which has less than <i>"some number from the user"</i> fiber and sort them from highest to lowest.</li>
    <li>Find all protein bars with more than X protein reviewed by Y (X and Y should be entered from the user).</li>
</ul>
  
### Open question<br>
Imagine that you have a very large database, think millions of protein bars. How do you think that the memory will behave with the database if you save it in a data structure ? Are there any problems? If yes, then how do we fix it?<br>
What is the best sort algorithm to be used here and what is its time complexity. Motivate!<br>


### XML file<br>
The XML file structure looks similar to this:
```xml
<products>
    	<bar SN="VyfdmYr">
		<fett>27.19</fett>
		<energy>1288.07</energy>
		<kolhydrat>25.96</kolhydrat>
		<protein>39.49</protein>
		<fiber>44.04</fiber>
		<review>
			<reviewer personID="PJ8">
				<date>2014-02-11</date>
				<score>4</score>
			</reviewer>   
		</review>
	</bar>


	<bar SN="pQEk83O">
		<fett>6.14</fett>
		<energy>2426.02</energy>
		<kolhydrat>1.4</kolhydrat>
		<protein>23.45</protein>
		<fiber>17.21</fiber>
		<review>
			<reviewer personID="k6Y">
				<date>2000-10-09</date>
				<score>5</score>
			</reviewer>
			<reviewer personID="k6p">
				<date>2000-10-09</date>
				<score>5</score>
			</reviewer>
		</review>
	</bar>   
</products>
```




