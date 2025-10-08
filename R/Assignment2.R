order = read.csv('C:/Users/dbda.STUDENTSDC/Documents/GitHub/CDAC/R/Datasets/Orders.csv')

#Ques1 i
str(order)

# ii
summary(order)


#Ques2
cars <- read.csv('C:/Users/dbda.STUDENTSDC/Documents/GitHub/CDAC/R/Datasets/cars2018.csv')
#cars <- read.csv('cars2018.csv')
table(cars$Aspiration)
table( cars$Transmission)
table(cars$Aspiration, cars$Transmission)
addmargins(table(cars$Aspiration, cars$Transmission))

#Ques3
cars$LNMPG <- log(cars$MPG)


#Que4

fahernhit <- function(f) {
  c <- (f-32)*5/9
  c
}

fahernhit(30)

#Ques5

varCoff <- function(data) {
  ans = (sd(data)/mean(data)) * 100
  ans
}

data = cars$MPG
varCoff(data)


#Ques6

replace_mean <- function(arr) {
  m <- mean(arr, na.rm=T)
  m
  ifelse(is.na(arr), m, arr )
}
arr <- c(9.31, 8.24, NA, 1.345, 0.56, NA, 0, 7.98)
replace_mean(arr)


