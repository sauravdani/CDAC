a <- c(44, 89, 12, 40, 80)
barplot(a)

data("mtcars")
hist(mtcars$mpg)

library(tidyverse)

plot(mtcars$disp, mtcars$mpg)

setwd('C:/Users/dbda.STUDENTSDC/Documents/GitHub/CDAC/Python/Jupyter')
library(ggplot2)
a <- read.csv("gapminder.csv")
ggplot(data=a,
       aes(x=lifeExp,y=gdpPercap, size=pop,color = continent))  + geom_point(alpha=0.5)

da <- group_by(a, continent) %>% summarise(gdpPercap)
da

ggplot(data = a, aes(y=gdpPercap,colour = continent))+
  geom_boxplot()

setwd('C:/Users/dbda.STUDENTSDC/Documents/GitHub/CDAC/R/Datasets/')
cars <- read.csv('cars2018.csv', stringsAsFactors = T)
library(ggplot2)
ggplot(data=cars,
       aes(x=Displacement, y=MPG)) + geom_point()

#############################################

ggplot(data = cars, aes(x=Displacement))+
  geom_histogram(bins = 10, colour = "black", fill = "#F4C2C2")

ggplot(data = cars, aes(x=Displacement))+
  geom_density(colour = "black", fill = "#F4C2C2")

ggplot(data = cars, aes(y=Displacement,colour = Transmission))+
  geom_boxplot()


########################  BAR   ###############################
ggplot(data = cars, aes(x=Transmission, fill = Aspiration))+
  geom_bar()

ggplot(data = cars, aes(x=Displacement, colour = Transmission))+
  geom_bar(position = "dodge")


######################## Facet_grid  ######################

ggplot(data = cars, aes(x=Displacement, y=MPG, colour = Transmission))+
  geom_point()+facet_grid(Transmission~.)
