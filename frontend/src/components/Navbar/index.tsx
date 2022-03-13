import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import { FcFilmReel } from 'react-icons/fc';
import './styles.css';

function Navbar() {
    return (
        <>
            <header>
                <nav className="container">
                    <div className="dsmovie-nav-content">
                        <h1>DSMovie</h1>
                        <FcFilmReel className='film'/>
                        <a href="https://github.com/lipollis" rel="noopener" >
                            <div className="dsmovie-contact-container">
                                <GithubIcon />
                                <p className="dsmovie-contact-link">/lipollis</p>
                            </div>
                        </a>
                    </div>
                </nav>
            </header>
            <div className='caixan'>
                <div className="parallelogram1n"></div>
                <div className="parallelogram2n"></div>
                <div className="parallelogram3n"></div>
                <div className="parallelogram4n"></div>
            </div>
        </>

    );
}

export default Navbar;