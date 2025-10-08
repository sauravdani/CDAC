 a <- 40
 b <- 30
 if (a>b){
   print("yess it is")
 } else{
   print("Its not")
 }
 
 
 for (i in 1:10){
   print(i*i)
 }
 
 for (i in 1:10){
   if (i%%2 != 0){
     print(i)
   }
 }
 
for (i in seq(1,19, 3)){
  print (i)
}
 
cnt <- 1
while(cnt < 11){
  print(cnt)
  cnt <- cnt+1
}


cnt <- 0
while(cnt < 11){
  cnt <- cnt+1
  if (cnt == 5){
    next
  }
  print(cnt)
}

for (i in seq(1,5,1)){
  if (i==4) next
  print (i)
}


data("CO2")
str(CO2) #give schema of data

table(CO2$Treatment)
table(CO2$Type)

housing <- read.csv('C:/Users/dbda.STUDENTSDC/Documents/GitHub/CDAC/R/Datasets/Housing.csv', stringsAsFactors = T)
housing

table(housing$prefarea)
table(housing$garagepl)
table(housing$gashw)
table(housing$recroom)

table( housing$recroom, housing$gashw)  #gives cross tab

table(housing$prefarea, housing$gashw)

ss_hosing <- subset(housing, prefarea=='yes' & housing$gashw=='yes')
ss_hosing


addmargins(table(housing$prefarea, housing$gashw)) #give cross tab with sum
####################################################################################

log(3)
log(3,10)

exp(1)
exp(2)

#########################################################################
marks <- c(12, 14,18, 23,24,34, 26,29,38,10,39,33,21)
result <- ifelse(marks >= 16, "Pass", "Fail") #saves count of pass values and fail values
table(result)
#################################
marks <- c(12, 14,18, 23,24,34, NA, 26,29,38,10,39,33,21)
mean(marks) #gives NA beacuse NA value in victor
mean(marks, na.rm = T) #remove na value and then calculate the mean
var(marks, na.rm = T)
#######################################

summary (housing$price) #gives min 1st qurtile, median, 3rd qurtile, max 
summary(housing$recroom)

summary(housing) #give summary of all coloums of the table

attach(housing) #it attcahes the table and not need to specify table name


summary(price)

detach(housing)
summary(price)




 