package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.cdpycssgdh;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ribwqtqdhb;
import androidx.lifecycle.jhduphickx;
import androidx.lifecycle.vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc extends androidx.fragment.app.oxmwwwfdhm implements eablkybsjg, androidx.core.app.jyumaefscl.iobyxmoadg {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private lqeggnwhkg mDelegate;
    private Resources mResources;

    class iobyxmoadg implements q5.gxszxtbevo.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // q5.gxszxtbevo.zoijcleaow
        public Bundle iobyxmoadg() {
            Bundle bundle = new Bundle();
            wkgbmnqykc.this.getDelegate().yadqdtsiqt(bundle);
            return bundle;
        }
    }

    class zoijcleaow implements wkgbmnqykc.zoijcleaow {
        zoijcleaow() {
        }

        @Override // wkgbmnqykc.zoijcleaow
        public void iobyxmoadg(Context context) {
            lqeggnwhkg delegate = wkgbmnqykc.this.getDelegate();
            delegate.jyumaefscl();
            delegate.pmvmpeiblj(wkgbmnqykc.this.getSavedStateRegistry().iobyxmoadg(wkgbmnqykc.DELEGATE_TAG));
        }
    }

    public wkgbmnqykc() {
        cqumvgiudr();
    }

    private void cqumvgiudr() {
        getSavedStateRegistry().ppxfxbqfkf(DELEGATE_TAG, new iobyxmoadg());
        addOnContextAvailableListener(new zoijcleaow());
    }

    private void esjtqupxsv() {
        vipkmwdibw.zoijcleaow(getWindow().getDecorView(), this);
        jhduphickx.zoijcleaow(getWindow().getDecorView(), this);
        q5.wflxmlrfwp.zoijcleaow(getWindow().getDecorView(), this);
        cdpycssgdh.zoijcleaow(getWindow().getDecorView(), this);
    }

    private boolean lereixgezr(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.activity.nufgyqmvbu, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        esjtqupxsv();
        getDelegate().eablkybsjg(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().dxjokdxxww(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.iobyxmoadg supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.lqeggnwhkg()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.lqeggnwhkg, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.iobyxmoadg supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.rgvfuqvkyq(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i13) {
        return (T) getDelegate().draadjrbmk(i13);
    }

    public lqeggnwhkg getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = lqeggnwhkg.btonecajqb(this, this);
        }
        return this.mDelegate;
    }

    public androidx.appcompat.app.zoijcleaow getDrawerToggleDelegate() {
        return getDelegate().rgvfuqvkyq();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().kcexrzcfyt();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && ribwqtqdhb.ppxfxbqfkf()) {
            this.mResources = new ribwqtqdhb(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public androidx.appcompat.app.iobyxmoadg getSupportActionBar() {
        return getDelegate().yggfygwlhe();
    }

    @Override // androidx.core.app.jyumaefscl.iobyxmoadg
    public Intent getSupportParentActivityIntent() {
        return androidx.core.app.gtknphoqwx.iobyxmoadg(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().iwizpuwonk();
    }

    @Override // androidx.activity.nufgyqmvbu, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().lereixgezr(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(androidx.core.app.jyumaefscl jyumaefsclVar) {
        jyumaefsclVar.ppxfxbqfkf(this);
    }

    @Override // androidx.fragment.app.oxmwwwfdhm, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().zynmafqrjb();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i13, KeyEvent keyEvent) {
        if (lereixgezr(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i13, keyEvent);
    }

    protected void onLocalesChanged(q1.nufgyqmvbu nufgyqmvbuVar) {
    }

    @Override // androidx.fragment.app.oxmwwwfdhm, androidx.activity.nufgyqmvbu, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i13, MenuItem menuItem) {
        if (super.onMenuItemSelected(i13, menuItem)) {
            return true;
        }
        androidx.appcompat.app.iobyxmoadg supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.btonecajqb() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i13, Menu menu) {
        return super.onMenuOpened(i13, menu);
    }

    protected void onNightModeChanged(int i13) {
    }

    @Override // androidx.activity.nufgyqmvbu, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i13, Menu menu) {
        super.onPanelClosed(i13, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().istkbnxepw(bundle);
    }

    @Override // androidx.fragment.app.oxmwwwfdhm, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().cdpycssgdh();
    }

    public void onPrepareSupportNavigateUpTaskStack(androidx.core.app.jyumaefscl jyumaefsclVar) {
    }

    @Override // androidx.fragment.app.oxmwwwfdhm, android.app.Activity
    protected void onStart() {
        super.onStart();
        getDelegate().iozdgvuglv();
    }

    @Override // androidx.fragment.app.oxmwwwfdhm, android.app.Activity
    protected void onStop() {
        super.onStop();
        getDelegate().lmojexxdyd();
    }

    @Override // androidx.appcompat.app.eablkybsjg
    public void onSupportActionModeFinished(androidx.appcompat.view.zoijcleaow zoijcleaowVar) {
    }

    @Override // androidx.appcompat.app.eablkybsjg
    public void onSupportActionModeStarted(androidx.appcompat.view.zoijcleaow zoijcleaowVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        androidx.core.app.jyumaefscl jyumaefsclVarEablkybsjg = androidx.core.app.jyumaefscl.eablkybsjg(this);
        onCreateSupportNavigateUpTaskStack(jyumaefsclVarEablkybsjg);
        onPrepareSupportNavigateUpTaskStack(jyumaefsclVarEablkybsjg);
        jyumaefsclVarEablkybsjg.gxszxtbevo();
        try {
            androidx.core.app.zoijcleaow.zoijcleaow(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i13) {
        super.onTitleChanged(charSequence, i13);
        getDelegate().kegysxyocb(charSequence);
    }

    @Override // androidx.appcompat.app.eablkybsjg
    public androidx.appcompat.view.zoijcleaow onWindowStartingSupportActionMode(androidx.appcompat.view.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.iobyxmoadg supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.vdvldrhtss()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.nufgyqmvbu, android.app.Activity
    public void setContentView(int i13) {
        esjtqupxsv();
        getDelegate().hcddaimhww(i13);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().wypolnanlu(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i13) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z13) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z13) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z13) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i13) {
        super.setTheme(i13);
        getDelegate().stevsuqkhv(i13);
    }

    public androidx.appcompat.view.zoijcleaow startSupportActionMode(androidx.appcompat.view.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        return getDelegate().tzroggbefp(iobyxmoadgVar);
    }

    @Override // androidx.fragment.app.oxmwwwfdhm
    public void supportInvalidateOptionsMenu() {
        getDelegate().iwizpuwonk();
    }

    public void supportNavigateUpTo(Intent intent) {
        androidx.core.app.gtknphoqwx.eablkybsjg(this, intent);
    }

    public boolean supportRequestWindowFeature(int i13) {
        return getDelegate().pkzmftpjix(i13);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return androidx.core.app.gtknphoqwx.gxszxtbevo(this, intent);
    }

    @Override // androidx.activity.nufgyqmvbu, android.app.Activity
    public void setContentView(View view) {
        esjtqupxsv();
        getDelegate().jpowsppfya(view);
    }

    @Override // androidx.activity.nufgyqmvbu, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        esjtqupxsv();
        getDelegate().hkdspvbjdz(view, layoutParams);
    }
}
