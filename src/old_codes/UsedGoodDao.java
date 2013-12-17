package old_codes;

import java.util.List;


import com.xinghen.domain.DisplayIterm;

public interface UsedGoodDao<T> extends BaseDao<T> {
	
	List<DisplayIterm>findByType (String type);
	
}
