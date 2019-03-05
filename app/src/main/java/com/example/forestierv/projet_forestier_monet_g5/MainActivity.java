package com.example.forestierv.projet_forestier_monet_g5;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        showFragment(0);
    }
    /**
     * ID of ConstraintLayout to put fragment inside
     */
    private static final int FRAGMENT_CONTAINER_ID =
            R.id.FragmentContainer;
    /**
     * list of all the fragments can be shown in the view
     */
    private final List<BaseBlocsFragment> _allFragments;

    public MainActivity(){
        _allFragments = new ArrayList<BaseBlocsFragment>();
        _allFragments.add(new FourButtonFragment());
        _allFragments.add(new FiveButtonFragment());
        _allFragments.add(new SixButtonFragment());
        _allFragments.add(new SevenButtonFragment());
        _allFragments.add(new EightButtonFragment());
        _allFragments.add(new NineButtonFragment());
        _allFragments.add(new TenButtonFragment());
    }

    /**
     * collect fragment in the list by index
     * put the fragment in the view
     * replace the previous if existing
     *
     * @param fragmentIndex index to find fragment in list
     */
    private void showFragment(int fragmentIndex) {
        Fragment fragment = _allFragments.get(fragmentIndex);

        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.beginTransaction()
                .replace(FRAGMENT_CONTAINER_ID, fragment)
                .commit();

        supportFragmentManager.executePendingTransactions();
    }


}

