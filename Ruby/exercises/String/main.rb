require_relative 'string.rb'

txt = "O Homem É Livre Para Fazer O Que Quer, Mas Não Para Querer O Que Quer"

obj = ChangeString.new(txt)

obj.findTxt("Homem")
obj.replaceString("Homem", "Ser Humano")
obj.upperCase()
obj.downCase()
