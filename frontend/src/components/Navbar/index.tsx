import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
// import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import './styles.css';

function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="https://github.com/lipollis" target="_blank" rel="noopener" >
                        <div className="dsmovie-contact-container">
                            <GithubIcon />
                            <p className="dsmovie-contact-link">/lipollis</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;