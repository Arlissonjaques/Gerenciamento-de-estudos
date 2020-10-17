class ChangeString

    def initialize(txt)
        @txt =  txt
    end

    def replaceString(partString, substitute)
        newTxt = @txt
        newTxt[partString] = substitute
        puts newTxt
    end

    def upperCase()
        puts @txt.upcase
    end
end
