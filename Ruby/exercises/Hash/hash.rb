
class ChangeHash

    def initialize()
        @hash = {:nome => "Arlisson", :lang => "Ruby", :estado => "Pará", :idade => 22}
    end

    def findValue(wanted)
        if @hash.value?(wanted)
            for key in @hash.keys
                if @hash[key] == wanted
                    puts "#{wanted} está na chave: #{key}"
                end
            end
        end
    end

    
end

