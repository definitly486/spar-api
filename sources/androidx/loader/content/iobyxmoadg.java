package androidx.loader.content;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg extends zoijcleaow {
    private static final boolean DEBUG = false;
    private static final String TAG = "AsyncTaskLoader";
    private volatile androidx.loader.content.iobyxmoadg.iobyxmoadg mCancellingTask;
    private Executor mExecutor;
    private Handler mHandler;
    private long mLastLoadCompleteTime;
    private volatile androidx.loader.content.iobyxmoadg.iobyxmoadg mTask;
    private long mUpdateThrottle;

    /* JADX INFO: renamed from: androidx.loader.content.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    final class RunnableC0155iobyxmoadg extends ppxfxbqfkf implements Runnable {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        boolean f9603esjtqupxsv;

        RunnableC0155iobyxmoadg() {
        }

        @Override // androidx.loader.content.ppxfxbqfkf
        protected void lqeggnwhkg(Object obj) {
            iobyxmoadg.this.dispatchOnCancelled(this, obj);
        }

        @Override // androidx.loader.content.ppxfxbqfkf
        protected void nufgyqmvbu(Object obj) {
            iobyxmoadg.this.dispatchOnLoadComplete(this, obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9603esjtqupxsv = false;
            iobyxmoadg.this.executePendingTask();
        }

        @Override // androidx.loader.content.ppxfxbqfkf
        protected Object zoijcleaow() {
            try {
                return iobyxmoadg.this.onLoadInBackground();
            } catch (OperationCanceledException e13) {
                if (gxszxtbevo()) {
                    return null;
                }
                throw e13;
            }
        }
    }

    public iobyxmoadg(Context context) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
    }

    public void cancelLoadInBackground() {
    }

    void dispatchOnCancelled(androidx.loader.content.iobyxmoadg.iobyxmoadg iobyxmoadgVar, Object obj) {
        onCanceled(obj);
        if (this.mCancellingTask == iobyxmoadgVar) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    void dispatchOnLoadComplete(androidx.loader.content.iobyxmoadg.iobyxmoadg iobyxmoadgVar, Object obj) {
        if (this.mTask != iobyxmoadgVar) {
            dispatchOnCancelled(iobyxmoadgVar, obj);
            return;
        }
        if (isAbandoned()) {
            onCanceled(obj);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(obj);
    }

    @Override // androidx.loader.content.zoijcleaow
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f9603esjtqupxsv);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f9603esjtqupxsv);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.mUpdateThrottle)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.mLastLoadCompleteTime == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.mLastLoadCompleteTime));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.f9603esjtqupxsv) {
            this.mTask.f9603esjtqupxsv = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.f9603esjtqupxsv = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        } else {
            if (this.mExecutor == null) {
                this.mExecutor = getExecutor();
            }
            this.mTask.ppxfxbqfkf(this.mExecutor);
        }
    }

    protected Executor getExecutor() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract Object loadInBackground();

    @Override // androidx.loader.content.zoijcleaow
    protected boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!isStarted()) {
            onContentChanged();
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.f9603esjtqupxsv) {
                this.mTask.f9603esjtqupxsv = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.f9603esjtqupxsv) {
            this.mTask.f9603esjtqupxsv = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        boolean zIobyxmoadg = this.mTask.iobyxmoadg(false);
        if (zIobyxmoadg) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zIobyxmoadg;
    }

    public void onCanceled(Object obj) {
    }

    @Override // androidx.loader.content.zoijcleaow
    protected void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new RunnableC0155iobyxmoadg();
        executePendingTask();
    }

    protected Object onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j13) {
        this.mUpdateThrottle = j13;
        if (j13 != 0) {
            this.mHandler = new Handler();
        }
    }
}
