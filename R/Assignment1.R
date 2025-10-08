#Ques1
orders = read.csv("C:/Users/dbda.STUDENTSDC/Documents/GitHub/CDAC/R/Datasets/Orders.csv")
order1 <- subset(orders, Payment.Terms=="Online")
order1

#Ques2
mtcar = data("mtcars")

write.csv(mtcar, "C:/Users/dbda.STUDENTSDC/Documents/GitHub/CDAC/R/Datasets/mtcar.csv")

#Ques3
dimond <-  read.csv2("C:/Users/dbda.STUDENTSDC/Documents/GitHub/CDAC/R/Datasets/Diamonds.csv")
dimonds2 <- subset(dimond, cut=="Premium" & color=="J")
dimonds2

#Ques4
dimond3 <- subset(dimond, select = c(carat, color, depth, price))
dimond3

#Ques5
mtcar2 <- mtcars[c(2,18, 30, 12),]
mtcar2

mtcar
