import androidx.compose.material.BottomNavigation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import tabs.FavoritesTab
import tabs.HomeTab
import tabs.ProfileTab
import tabs.TabNavigationItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    MaterialTheme {
        TabNavigator(HomeTab) {
            Scaffold(
                content = { CurrentTab() },
                bottomBar = {
                    BottomNavigation {
                        TabNavigationItem(HomeTab)
                        TabNavigationItem(FavoritesTab)
                        TabNavigationItem(ProfileTab)
                    }
                }
            )
        }
    }
}




expect fun getPlatformName(): String

