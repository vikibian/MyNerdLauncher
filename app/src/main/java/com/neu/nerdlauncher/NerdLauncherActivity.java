package com.neu.nerdlauncher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class NerdLauncherActivity extends SingFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return NerdLauncherFragment.newInsance();
    }


}
