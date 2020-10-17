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

    def addElement(element)
        $arr << element
        print "#{$arr}\n"
    end

    def deleteElement(element)
        $arr.delete(element)
        print "#{$arr}\n"
    end

    def replaceElement(element, substitute)
        index = 0
        if $arr.include?(element)
            while index < $arr.length
                if $arr[index] == element
                    $arr[index] = substitute
                end
                index += 1
            end
            print "#{$arr}\n"
        else
            puts "Elemento não está no arrey"
        end
    end

end

