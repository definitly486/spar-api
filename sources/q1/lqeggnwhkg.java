package q1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {

    private static class iobyxmoadg {
        public static Handler iobyxmoadg(Looper looper) {
            return Handler.createAsync(looper);
        }

        public static boolean zoijcleaow(Handler handler, Runnable runnable, Object obj, long j13) {
            return handler.postDelayed(runnable, obj, j13);
        }
    }

    public static Handler iobyxmoadg(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return iobyxmoadg.iobyxmoadg(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e13) {
            e = e13;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e14) {
            e = e14;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e15) {
            e = e15;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e16) {
            Throwable cause = e16.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean zoijcleaow(Handler handler, Runnable runnable, Object obj, long j13) {
        if (Build.VERSION.SDK_INT >= 28) {
            return iobyxmoadg.zoijcleaow(handler, runnable, obj, j13);
        }
        Message messageObtain = Message.obtain(handler, runnable);
        messageObtain.obj = obj;
        return handler.sendMessageDelayed(messageObtain, j13);
    }
}
