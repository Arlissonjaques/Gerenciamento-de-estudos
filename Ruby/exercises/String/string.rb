class ChangeString

    def initialize(txt)
        @txt = txt
    end

    def findTxt(word)
        i = 0
        if @txt.include?(word)
            while i < @txt.split().length
                if @txt.split()[i] == word
                    puts "#{word} está na posição: #{i}"
                end
                i += 1
            end
        else
            puts "Essa palavra não está na frase"
        end
    end

    def replaceString(partString, substitute)
        @txt[partString] = substitute
        puts @txt
    end

    def upperCase()
        puts @txt.upcase
    end

    def downCase()
        puts @txt.downcase
    end

    
end
