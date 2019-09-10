# Practice 8: Isograms

**Determine if a word or phrase is an isogram.**

An isogram (also known as a "nonpattern word") is a word or phrase without a repeating letter, however spaces and hyphens are allowed to appear multiple times.

Examples of isograms:

- lumberjacks
- background
- downstream
- six-year-old

The word *isograms*, however, is not an isogram, because the s repeats.

## Tips

I recommend that you add tests that use accented characters such as ë. If such tests fail even though you think you've implemented the method correctly, this could be because of the [JVM encoding](https://www.ibm.com/support/knowledgecenter/en/ssw_ibm_i_61/rzaha/international.htm). 
Try setting the `JAVA_TOOL_OPTIONS` environment variable to `-Dfile.encoding=UTF8` to fix this.

- To set an environment variable on Windows:
    1. Go to Computer -> Properties -> Advanced System Settings
    2. Add a new environment variable

- [To set an environment variable in MacOS](http://blog.lidalia.org.uk/2011/04/setting-default-java-file-encoding-to.html)

- [To set an environment variable in Linux](https://unix.stackexchange.com/questions/151733/where-can-i-set-global-java-options)

## Source

Wikipedia [https://en.wikipedia.org/wiki/Isogram](https://en.wikipedia.org/wiki/Isogram).

