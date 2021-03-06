package mobi.cangol.mobile.base;

import android.os.Bundle;

public interface CustomFragmentActivityDelegate {

    /**
     * 初始化自定义栈管理器
     * @param containerId
     */
	 void initFragmentStack(int containerId);

    /**
     * fragment
     * @param fragmentClass
     * @param tag
     * @param args
     */
	 void  replaceFragment(Class<? extends BaseFragment> fragmentClass,String tag,Bundle args);

    /**
     * 获取自定栈管理器
     * @return
     */
	 CustomFragmentManager getCustomFragmentManager();
	
}
