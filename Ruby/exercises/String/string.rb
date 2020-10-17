class ChangeString

    def initialize(txt)
        @txt =  txt
    end

    def replaceString(partString, substitute)
        @txt[partString] = substitute
        puts @txt
    end
end
