- SDK initialization requires a logger object to be provided. But the logger
class is obfuscated.

- Application crashes if compiled with compile and support library sdk version 28

- On Android Pie devices, when you try searching for a query, application crashes.

Here is the crash log -

```
2019-04-16 13:17:07.392 32398-32398/? E/AndroidRuntime: FATAL EXCEPTION: main
    Process: com.test.sdk, PID: 32398
    java.lang.NoClassDefFoundError: Failed resolution of: Landroid/databinding/DataBindingUtil;
        at com.yahoo.search.yhssdk.data.e.onCreateViewHolder(SourceFile:97)
        at android.support.v7.widget.RecyclerView$Adapter.createViewHolder(RecyclerView.java:6685)
        at android.support.v7.widget.RecyclerView$Recycler.tryGetViewHolderForPositionByDeadline(RecyclerView.java:5869)
        at android.support.v7.widget.RecyclerView$Recycler.getViewForPosition(RecyclerView.java:5752)
        at android.support.v7.widget.RecyclerView$Recycler.getViewForPosition(RecyclerView.java:5748)
        at android.support.v7.widget.LinearLayoutManager$LayoutState.next(LinearLayoutManager.java:2232)
        at android.support.v7.widget.GridLayoutManager.layoutChunk(GridLayoutManager.java:556)
        at android.support.v7.widget.LinearLayoutManager.fill(LinearLayoutManager.java:1519)
        at android.support.v7.widget.LinearLayoutManager.onLayoutChildren(LinearLayoutManager.java:614)
        at android.support.v7.widget.GridLayoutManager.onLayoutChildren(GridLayoutManager.java:170)
        at android.support.v7.widget.RecyclerView.dispatchLayoutStep2(RecyclerView.java:3812)
        at android.support.v7.widget.RecyclerView.dispatchLayout(RecyclerView.java:3529)
        at android.support.v7.widget.RecyclerView.onLayout(RecyclerView.java:4082)
        at android.view.View.layout(View.java:20672)
        at android.view.ViewGroup.layout(ViewGroup.java:6194)
        at android.widget.FrameLayout.layoutChildren(FrameLayout.java:323)
        at android.widget.FrameLayout.onLayout(FrameLayout.java:261)
        at android.view.View.layout(View.java:20672)
        at android.view.ViewGroup.layout(ViewGroup.java:6194)
        at android.support.design.widget.HeaderScrollingViewBehavior.layoutChild(HeaderScrollingViewBehavior.java:132)
        at android.support.design.widget.ViewOffsetBehavior.onLayoutChild(ViewOffsetBehavior.java:42)
        at android.support.design.widget.AppBarLayout$ScrollingViewBehavior.onLayoutChild(AppBarLayout.java:1361)
        at android.support.design.widget.CoordinatorLayout.onLayout(CoordinatorLayout.java:894)
        at android.view.View.layout(View.java:20672)
        at android.view.ViewGroup.layout(ViewGroup.java:6194)
        at android.widget.FrameLayout.layoutChildren(FrameLayout.java:323)
        at android.widget.FrameLayout.onLayout(FrameLayout.java:261)
        at android.view.View.layout(View.java:20672)
        at android.view.ViewGroup.layout(ViewGroup.java:6194)
        at android.widget.LinearLayout.setChildFrame(LinearLayout.java:1812)
        at android.widget.LinearLayout.layoutVertical(LinearLayout.java:1656)
        at android.widget.LinearLayout.onLayout(LinearLayout.java:1565)
        at android.view.View.layout(View.java:20672)
        at android.view.ViewGroup.layout(ViewGroup.java:6194)
        at android.widget.FrameLayout.layoutChildren(FrameLayout.java:323)
        at android.widget.FrameLayout.onLayout(FrameLayout.java:261)
        at android.view.View.layout(View.java:20672)
        at android.view.ViewGroup.layout(ViewGroup.java:6194)
        at android.widget.LinearLayout.setChildFrame(LinearLayout.java:1812)
        at android.widget.LinearLayout.layoutVertical(LinearLayout.java:1656)
        at android.widget.LinearLayout.onLayout(LinearLayout.java:1565)
        at android.view.View.layout(View.java:20672)
        at android.view.ViewGroup.layout(ViewGroup.java:6194)
        at android.widget.FrameLayout.layoutChildren(FrameLayout.java:323)
        at android.widget.FrameLayout.onLayout(FrameLayout.java:261)
        at com.android.internal.policy.DecorView.onLayout(DecorView.java:753)
        at android.view.View.layout(View.java:20672)
        at android.view.ViewGroup.layout(ViewGroup.java:6194)
        at android.view.ViewRootImpl.performLayout(ViewRootImpl.java:2792)
        at android.view.ViewRootImpl.performTraversals(ViewRootImpl.java:2319)
        at android.view.ViewRootImpl.doTraversal(ViewRootImpl.java:1460)
        at android.view.ViewRootImpl$TraversalRunnable.run(ViewRootImpl.java:7183)
        at android.view.Choreographer$CallbackRecord.run(Choreographer.java:949)
        at android.view.Choreographer.doCallbacks(Choreographer.java:761)
        at android.view.Choreographer.doFrame(Choreographer.java:696)
2019-04-16 13:17:07.394 32398-32398/? E/AndroidRuntime:     at android.view.Choreographer$FrameDisplayEventReceiver.run(Choreographer.java:935)
        at android.os.Handler.handleCallback(Handler.java:873)
        at android.os.Handler.dispatchMessage(Handler.java:99)
        at android.os.Looper.loop(Looper.java:193)
        at android.app.ActivityThread.main(ActivityThread.java:6718)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:493)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:858)
     Caused by: java.lang.ClassNotFoundException: Didn't find class "android.databinding.DataBindingUtil" on path: DexPathList[[zip file "/system/framework/org.apache.http.legacy.boot.jar", zip file "/data/app/com.test.sdk-jp4NPdmBbnphOYDfX4hjWw==/base.apk"],nativeLibraryDirectories=[/data/app/com.test.sdk-jp4NPdmBbnphOYDfX4hjWw==/lib/arm64, /system/lib64]]
        at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:134)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:379)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
        	... 63 more

```
