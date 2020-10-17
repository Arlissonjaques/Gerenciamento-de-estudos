require_relative 'string.rb'

txt = "o homem é livre para fazer o que quer, mas não para querer o que quer"

obj = ChangeString.new(txt)

obj.replaceString("homem", "ser humano")