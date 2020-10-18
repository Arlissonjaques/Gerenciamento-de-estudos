require_relative 'hash.rb'

obj = ChangeHash.new

obj.findValue(22)
obj.add(:altura, 1.70)
obj.remove(:altura)