package jcurses.in.sz.jcurses.widgets;

import java.io.FileFilter;

public interface JCursesFileFilterFactory {
	
	public FileFilter generateFileFilter(String filterString);

}
