p <- 1000
q <- 2000
if(p>q){
  print("h")
}


data(mtcars)
################################################################
p <- c(100000, 50000, 750000)
r <- c(3,4)
n <- c(7.5, 8, 7.25)

si <- p*r*n/100
print(si)
########################################################
a <- "maths"
class(a)

b <- 38
class(b)

c <- as.integer(b)
class(c)

d <- T
class(d)
###############################################################
p <- c(100000, 50000, 750000)
class(p)

s <- c("math", "ml", 3)
class(s)
####################################


data(CO2)
class(CO2$conc)

g <- list(1,2,3,"LOOP","Else", T , 34)
print(g)


y <- list(a=12, b=3.14, c="PI", d=c(3,4,5,1), e=F)
class(y$e)
#######################################################

CO2
class(CO2$Plant) #will return factor
CO2$Plant #will retun vector of plant
#################################

g <- c(34,NA,67,NA, 0, NA,NA)
is.na(g)
sum(is.na(g)) #Will return no. of NA

####################################

f <-  0
p <- 0
w <- f/p
is.nan(w)
is.na(w)
is.finite(w)
is.infinite(w)


f <-  58
p <- 0
w <- f/p
is.nan(w)
is.na(w)
is.finite(w)
is.infinite(w)

infi = 23456**123456
is.finite(infi)
######################################

m = matrix(c(1,2,3,4,5), 2,2,byrow=T)
m

a <- c(1,2,3,4)
b <- c(4,5)

rb <- rbind(a,b)
rb


a <- c(1,2,3,4)
b <- c(4,5)

cb <- cbind(a,b)
cb

a <- c(1,2,3,4)
b <- c(4,5,6,7,8,9)

rb <- rbind(b,a)
rb
#################################
a <- array(data = c(1,2,3,4,5,6,7,8,9,10,11,12), dim=c(2,2,3))
a
######################################
df <- data.frame(s=c(2,3,4,7,8), d=c(90,34,23,45,56))
df
df$s
colnames(df) # this is only applicable for data frames
names(df)
