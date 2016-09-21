import nltk
mysencetence = """During a manned mission to Mars, Astronaut Mark Watney (Matt Damon) is presumed dead after a fierce storm and left behind by his crew. But Watney has survived and find himself stranded and alone on the hostile planet."""

mysencetencetokens = nltk.word_tokenize(mysencetence)
#Stemming
porter = nltk.PorterStemmer()
looper = 0
for token in mysencetencetokens:
	mysencetencetokens[looper] = porter.stem(token)
	looper += 1
print "stemmed -->"
print mysencetencetokens