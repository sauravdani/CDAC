library(tidyverse)
library(dplyr)

#################Arrange function###############################
setwd('C:/Users/dbda.STUDENTSDC/Documents/GitHub/CDAC/R/Datasets/')
cars2 <- read.csv("cars2018.csv", stringsAsFactors = T)

arrCars <- arrange(cars2, cars2$Displacement)
arrCars


items <- read.csv("Items.csv")
ascItems <- arrange(items, items$Item.Type)

descItems <- arrange(items, desc(items$Item.Type), desc(items$Price))

##########################Select function#####################################

sel_cars <- select(cars2, Model.Index,Gears,Aspiration)
sel_cars <- select(cars2, -c(Model.Index,Gears,Aspiration))
sel_cars <- select(cars2, Model:Transmission)
#sel_cars <- select(cars2, Model:Transmission,min(cars2$Gears))
sel_cars <-  select(cars2, starts_with("M"))
sel_cars <-  select(cars2, contains("ion"))
sel_cars <-  select(cars2, contains("tion"))

##########################filter function#####################################

fil_cars <- filter(cars2, MPG > 25 & Gears < 4)
min_car1 <- filter(cars2, MPG==max(cars2$MPG))

fil_cars <- filter(cars2, cars2$Drive %in% c('All Wheel Drive','4-Wheel Drive'))


#########################Renaming########################################

ren_cars <- rename(cars2, mt.eth = Max.Ethanol)
ren_cars <- rename(cars2, name = Model)

######################## Mutate #######################
#IT ENABLES TO CRATE MUTIPLE COLOUM AT A TIME

  mut_cars <- mutate(cars2, ratio=cars2$Displacement/cars2$Cylinders)

######################## summarize #######################
#can disply different statistics with this
summarise(cars2, mu_mpg = mean(MPG),
          sd_mpg= sd(MPG), med_cyl=median(cars2$Cylinders))

######################## Group by #######################
grp_t <- group_by(cars2, Transmission)
summarise(grp_t, mu_mpg = mean(MPG),
          sd_mpg= sd(MPG), med_cyl=median(cars2$Cylinders))



#######################################################################   
#find the brand with max total price
grp_item <- group_by(items, items$Brand)

items %>% 
  summarise(grp_item) %>% 
  



















