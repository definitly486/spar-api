package androidx.loader.content;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {
    private Context mContext;
    private int mId;
    private InterfaceC0157zoijcleaow mListener;
    private iobyxmoadg mOnLoadCanceledListener;
    private boolean mStarted = false;
    private boolean mAbandoned = false;
    private boolean mReset = true;
    private boolean mContentChanged = false;
    private boolean mProcessingChange = false;

    public interface iobyxmoadg {
    }

    /* JADX INFO: renamed from: androidx.loader.content.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public interface InterfaceC0157zoijcleaow {
        void iobyxmoadg(zoijcleaow zoijcleaowVar, Object obj);
    }

    public zoijcleaow(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public String dataToString(Object obj) {
        StringBuilder sb3 = new StringBuilder(64);
        if (obj == null) {
            sb3.append("null");
        } else {
            Class<?> cls = obj.getClass();
            sb3.append(cls.getSimpleName());
            sb3.append("{");
            sb3.append(Integer.toHexString(System.identityHashCode(cls)));
            sb3.append("}");
        }
        return sb3.toString();
    }

    public void deliverCancellation() {
    }

    public void deliverResult(Object obj) {
        InterfaceC0157zoijcleaow interfaceC0157zoijcleaow = this.mListener;
        if (interfaceC0157zoijcleaow != null) {
            interfaceC0157zoijcleaow.iobyxmoadg(this, obj);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }

    public void forceLoad() {
        onForceLoad();
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    protected void onAbandon() {
    }

    protected abstract boolean onCancelLoad();

    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    protected void onForceLoad() {
    }

    protected void onReset() {
    }

    protected abstract void onStartLoading();

    protected void onStopLoading() {
    }

    public void registerListener(int i13, InterfaceC0157zoijcleaow interfaceC0157zoijcleaow) {
        if (this.mListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.mListener = interfaceC0157zoijcleaow;
        this.mId = i13;
    }

    public void registerOnLoadCanceledListener(iobyxmoadg iobyxmoadgVar) {
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z13 = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z13;
        return z13;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb3.append(cls.getSimpleName());
        sb3.append("{");
        sb3.append(Integer.toHexString(System.identityHashCode(cls)));
        sb3.append(" id=");
        sb3.append(this.mId);
        sb3.append("}");
        return sb3.toString();
    }

    public void unregisterListener(InterfaceC0157zoijcleaow interfaceC0157zoijcleaow) {
        InterfaceC0157zoijcleaow interfaceC0157zoijcleaow2 = this.mListener;
        if (interfaceC0157zoijcleaow2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0157zoijcleaow2 != interfaceC0157zoijcleaow) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mListener = null;
    }

    public void unregisterOnLoadCanceledListener(iobyxmoadg iobyxmoadgVar) {
        throw new IllegalStateException("No listener register");
    }
}
