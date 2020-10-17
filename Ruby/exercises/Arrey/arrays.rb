$arr = ["Mateus", "Marcos", "Lucas", "João", "Tiago", "Pedro", "Gabriel", "Felipe"]

class ChangeArrey
    
    def findElement(element)
        index = 0

        if $arr.include?(element)
            while index < $arr.length
                if $arr[index] == element
                    puts "#{element} está na posição: #{index}"
                end
                index += 1
            end
        else
            puts "Elemento não está no arrey"
        end
    end

end

