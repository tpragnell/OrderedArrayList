#OrderedArrayList

Summary of discussion...

We brought up the question of how we were going to create a constructor for this problem. We discussed how the list is filled with null values originally. Possibly we could set the size to zero so that there won't be null values. We discussed private variables and whether or not we needed to use them for our constructors. We might be able to just input zero into the constructors and get rid of the preassigned value. The constructor would call the superarray initial capacity constructor with an initial capacity of zero. We discussed the syntax of our constructors and the holder. Nulls are bad, so we should start at zero.
